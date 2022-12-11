import pandas as pd

def data_preprocess(text):
    text = text.replace("\n", " ").replace("\t", " ")
    return text

if __name__ == "__main__":
    df = pd.read_csv("./news_summary.csv", low_memory=False)
    for row in df.itertuples():
        row_content = list(row[1:])
        news_name = row_content[2].replace("\\", "").replace("/", "").replace("?", "").replace(":", "").replace("*", "").replace("<", "").replace(">", "").replace("|", "").replace('"', "")
        full_content = data_preprocess(str(row_content[5]))
        file_path = "./data/" + news_name + ".txt"
        with open(file_path, 'w', encoding="utf-8") as f:
            f.write(full_content)